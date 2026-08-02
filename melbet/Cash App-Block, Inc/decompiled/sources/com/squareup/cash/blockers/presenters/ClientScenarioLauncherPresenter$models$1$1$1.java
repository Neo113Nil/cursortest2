package com.squareup.cash.blockers.presenters;

import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.passcode.presenters.EndAppLockPresenter;
import com.squareup.cash.R;
import com.squareup.cash.bitcoin.viewmodels.BitcoinAmountViewEvent;
import com.squareup.cash.blockers.actions.viewevents.BlockerActionFileDownloadEvent$Cancel;
import com.squareup.cash.blockers.actions.viewevents.BlockerActionFileDownloadFailureViewEvent;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.AuthorizeGooglePayViewEvent$Exit;
import com.squareup.cash.blockers.viewmodels.BusinessDetailsBackConfirmResult$Negative;
import com.squareup.cash.blockers.viewmodels.BusinessDetailsBackConfirmResult$Positive;
import com.squareup.cash.blockers.viewmodels.BusinessDetailsBackConfirmViewEvent;
import com.squareup.cash.blockers.viewmodels.CameraErrorResult$Cancel;
import com.squareup.cash.blockers.viewmodels.CameraErrorResult$Retry;
import com.squareup.cash.blockers.viewmodels.CameraErrorViewEvent;
import com.squareup.cash.blockers.viewmodels.CameraPermissionResult$Negative;
import com.squareup.cash.blockers.viewmodels.CameraPermissionResult$Positive;
import com.squareup.cash.blockers.viewmodels.CameraPermissionViewEvent;
import com.squareup.cash.blockers.viewmodels.CardActivationViewEvent$Back;
import com.squareup.cash.blockers.viewmodels.CashtagConfirmationViewEvent;
import com.squareup.cash.blockers.viewmodels.CashtagErrorViewEvent$NegativeClick;
import com.squareup.cash.blockers.viewmodels.ConfirmCvvViewEvent$Next;
import com.squareup.cash.blockers.viewmodels.ConfirmExitOnboardingFlowViewEvent;
import com.squareup.cash.blockers.viewmodels.ConfirmHelpViewEvent;
import com.squareup.cash.blockers.viewmodels.ConfirmableOptionViewEvent;
import com.squareup.cash.blockers.viewmodels.ErrorViewEvent$Close;
import com.squareup.cash.blockers.viewmodels.FileBlockerExplanationResult$Negative;
import com.squareup.cash.blockers.viewmodels.FileBlockerExplanationResult$Positive;
import com.squareup.cash.blockers.viewmodels.FileBlockerExplanationViewEvent;
import com.squareup.cash.blockers.viewmodels.FilesetUploadErrorResult$Negative;
import com.squareup.cash.blockers.viewmodels.FilesetUploadErrorResult$Positive;
import com.squareup.cash.blockers.viewmodels.FilesetUploadErrorViewEvent;
import com.squareup.cash.blockers.viewmodels.FilesetUploadLoadingResult$Negative;
import com.squareup.cash.blockers.viewmodels.FilesetUploadLoadingViewEvent$Cancel;
import com.squareup.cash.blockers.viewmodels.FilesetUploadOptionsSheetResult;
import com.squareup.cash.blockers.viewmodels.FilesetUploadOptionsViewEvent;
import com.squareup.cash.blockers.viewmodels.FormMenuActionViewEvent$ActionClick;
import com.squareup.cash.blockers.viewmodels.GetFlowLoadingViewEvent$HandleError;
import com.squareup.cash.blockers.viewmodels.GpsExplainerViewEvent;
import com.squareup.cash.blockers.viewmodels.HelpItemMessageViewEvent$Cancel;
import com.squareup.cash.blockers.viewmodels.HelpOptionsViewEvent;
import com.squareup.cash.blockers.viewmodels.IneligibleMergeResult;
import com.squareup.cash.blockers.viewmodels.IneligibleMergeViewEvent;
import com.squareup.cash.blockers.viewmodels.InstrumentSelectionDetailsSheetViewEvent;
import com.squareup.cash.blockers.viewmodels.InstrumentSelectionDetailsViewEvent$Confirm;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.mooncake.screens.AlertDialogResult;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.profile.presenters.AddAliasPresenter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.protos.franklin.api.HelpItem;
import com.squareup.util.android.AndroidActivityFinisher;
import com.squareup.util.android.AndroidToaster;
import com.squareup.util.android.Toaster$Length;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.ConvertFromJavaKt$$Lambda$4;
import kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$23;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes4.dex */
public final class ClientScenarioLauncherPresenter$models$1$1$1 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    public /* synthetic */ ClientScenarioLauncherPresenter$models$1$1$1(Object obj, int i) {
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        AlertDialogResult alertDialogResult;
        FilesetUploadOptionsSheetResult filesetUploadOptionsSheetResult;
        int i = this.$r8$classId;
        Back back = Back.INSTANCE;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                BlockersHelper.BlockersAction blockersAction = (BlockersHelper.BlockersAction) obj;
                DisclosurePresenter disclosurePresenter = (DisclosurePresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) disclosurePresenter.navigator;
                if (blockersAction instanceof BlockersHelper.BlockersAction.ShowError) {
                    ((BlockerFlowListener) disclosurePresenter.appService).onFlowCancelled(((BlockersHelper.BlockersAction.ShowError) blockersAction).blockersData);
                    BlockersScreens.ClientScenarioLauncher clientScenarioLauncher = (BlockersScreens.ClientScenarioLauncher) disclosurePresenter.args;
                    if (clientScenarioLauncher.goToRequesterOnError) {
                        screenNavigator.goTo(clientScenarioLauncher.requester);
                    }
                    ((AndroidToaster) disclosurePresenter.blockersNavigator).makeToast(((AndroidStringManager) disclosurePresenter.stringManager).get(R.string.blockers_retrofit_error_message), Toaster$Length.SHORT);
                } else if (blockersAction instanceof BlockersHelper.BlockersAction.ShowScreen) {
                    screenNavigator.goTo(((BlockersHelper.BlockersAction.ShowScreen) blockersAction).screen);
                }
                return Unit.INSTANCE;
            case 1:
                ErrorPresenter errorPresenter = (ErrorPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator2 = (BetterNavigator.ScreenNavigator) errorPresenter.navigator;
                BlockerActionFileDownloadFailureViewEvent blockerActionFileDownloadFailureViewEvent = (BlockerActionFileDownloadFailureViewEvent) obj;
                if (Intrinsics.areEqual(blockerActionFileDownloadFailureViewEvent, BlockerActionFileDownloadFailureViewEvent.PositiveClick.INSTANCE)) {
                    screenNavigator2.goTo(new Finish(((BlockersScreens.BlockerActionFileDownloadFailureDialogScreen) errorPresenter.args).positiveAction));
                } else {
                    if (!Intrinsics.areEqual(blockerActionFileDownloadFailureViewEvent, BlockerActionFileDownloadFailureViewEvent.NegativeClick.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    NavAction$$ExternalSyntheticOutline0.m((Object) null, screenNavigator2);
                }
                return Unit.INSTANCE;
            case 2:
                if (Intrinsics.areEqual((BlockerActionFileDownloadEvent$Cancel) obj, BlockerActionFileDownloadEvent$Cancel.INSTANCE)) {
                    NavAction$$ExternalSyntheticOutline0.m((Object) null, ((AddAliasPresenter) obj2).navigator);
                    return Unit.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 3:
                if (!Intrinsics.areEqual((AuthorizeGooglePayViewEvent$Exit) obj, AuthorizeGooglePayViewEvent$Exit.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                AuthorizeGooglePayPresenter authorizeGooglePayPresenter = (AuthorizeGooglePayPresenter) obj2;
                authorizeGooglePayPresenter.navigator.goTo(authorizeGooglePayPresenter.args.blockersData.exitScreen);
                return Unit.INSTANCE;
            case 4:
                BitcoinAmountViewEvent bitcoinAmountViewEvent = (BitcoinAmountViewEvent) obj;
                Presenter.Binding binding = (Presenter.Binding) ((CardLockPresenter) obj2).flowNavigationHelper;
                if (binding != null) {
                    binding.sendEvent(bitcoinAmountViewEvent);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                throw null;
            case 5:
                BetterNavigator.ScreenNavigator screenNavigator3 = ((AddAliasPresenter) obj2).navigator;
                BusinessDetailsBackConfirmViewEvent businessDetailsBackConfirmViewEvent = (BusinessDetailsBackConfirmViewEvent) obj;
                if (Intrinsics.areEqual(businessDetailsBackConfirmViewEvent, BusinessDetailsBackConfirmViewEvent.Cancel.INSTANCE)) {
                    screenNavigator3.goTo(new Finish(BusinessDetailsBackConfirmResult$Negative.INSTANCE));
                } else {
                    if (!Intrinsics.areEqual(businessDetailsBackConfirmViewEvent, BusinessDetailsBackConfirmViewEvent.Confirm.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator3.goTo(new Finish(BusinessDetailsBackConfirmResult$Positive.INSTANCE));
                }
                return Unit.INSTANCE;
            case 6:
                BetterNavigator.ScreenNavigator screenNavigator4 = ((AddAliasPresenter) obj2).navigator;
                CameraErrorViewEvent cameraErrorViewEvent = (CameraErrorViewEvent) obj;
                if (Intrinsics.areEqual(cameraErrorViewEvent, CameraErrorViewEvent.Cancel.INSTANCE)) {
                    screenNavigator4.goTo(new Finish(CameraErrorResult$Cancel.INSTANCE));
                } else {
                    if (!Intrinsics.areEqual(cameraErrorViewEvent, CameraErrorViewEvent.Retry.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator4.goTo(new Finish(CameraErrorResult$Retry.INSTANCE));
                }
                return Unit.INSTANCE;
            case 7:
                CameraPermissionPresenter cameraPermissionPresenter = (CameraPermissionPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator5 = cameraPermissionPresenter.navigator;
                CameraPermissionViewEvent cameraPermissionViewEvent = (CameraPermissionViewEvent) obj;
                if (Intrinsics.areEqual(cameraPermissionViewEvent, CameraPermissionViewEvent.NegativeClick.INSTANCE)) {
                    screenNavigator5.goTo(new Finish(CameraPermissionResult$Negative.INSTANCE));
                } else {
                    if (!Intrinsics.areEqual(cameraPermissionViewEvent, CameraPermissionViewEvent.PositiveClick.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    cameraPermissionPresenter.intentLauncher.launchSettings();
                    screenNavigator5.goTo(new Finish(CameraPermissionResult$Positive.INSTANCE));
                }
                return Unit.INSTANCE;
            case 8:
                CardStudioPresenter cardStudioPresenter = (CardStudioPresenter) obj2;
                BlockersScreens.CardActivationScreen cardActivationScreen = (BlockersScreens.CardActivationScreen) cardStudioPresenter.cardStudioQueries;
                if (((CardActivationViewEvent$Back) obj) == null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                ((BlockerFlowListener) cardStudioPresenter.appConfig).onFlowCancelled(cardActivationScreen.blockersData);
                ((BetterNavigator.ScreenNavigator) cardStudioPresenter.navigator).goTo(cardActivationScreen.blockersData.exitScreen);
                return Unit.INSTANCE;
            case 9:
                CashtagConfirmationViewEvent cashtagConfirmationViewEvent = (CashtagConfirmationViewEvent) obj;
                if (Intrinsics.areEqual(cashtagConfirmationViewEvent, CashtagConfirmationViewEvent.Cancel.INSTANCE)) {
                    alertDialogResult = AlertDialogResult.NEGATIVE;
                } else {
                    if (!Intrinsics.areEqual(cashtagConfirmationViewEvent, CashtagConfirmationViewEvent.Confirm.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    alertDialogResult = AlertDialogResult.POSITIVE;
                }
                ((BetterNavigator.ScreenNavigator) ((ErrorPresenter) obj2).navigator).goTo(new Finish(alertDialogResult));
                return Unit.INSTANCE;
            case 10:
                if (Intrinsics.areEqual((CashtagErrorViewEvent$NegativeClick) obj, CashtagErrorViewEvent$NegativeClick.INSTANCE)) {
                    ((BetterNavigator.ScreenNavigator) ((ErrorPresenter) obj2).navigator).goTo(back);
                    return Unit.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 11:
                MusicPresenter musicPresenter = (MusicPresenter) obj2;
                BlockersScreens.ConfirmCvvScreen confirmCvvScreen = (BlockersScreens.ConfirmCvvScreen) musicPresenter.musicPlayer;
                ConfirmCvvViewEvent$Next confirmCvvViewEvent$Next = (ConfirmCvvViewEvent$Next) obj;
                if (confirmCvvViewEvent$Next == null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                BetterNavigator.ScreenNavigator screenNavigator6 = (BetterNavigator.ScreenNavigator) musicPresenter.navigator;
                String str = confirmCvvScreen.instrumentToken;
                String valueOf = String.valueOf(confirmCvvViewEvent$Next.cvvLength);
                BlockersScreens.SetPinScreen.TextOverrides textOverrides = confirmCvvScreen.setPinTextOverrides;
                BlockersData blockersData = confirmCvvScreen.blockersData;
                blockersData.getClass();
                valueOf.getClass();
                textOverrides.getClass();
                screenNavigator6.goTo(new BlockersScreens.SetPinScreen(blockersData, true, false, str, new RedactedString(valueOf), new RedactedString(null), new RedactedString(null), textOverrides, false));
                return Unit.INSTANCE;
            case 12:
                ErrorPresenter errorPresenter2 = (ErrorPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator7 = (BetterNavigator.ScreenNavigator) errorPresenter2.navigator;
                ConfirmExitOnboardingFlowViewEvent confirmExitOnboardingFlowViewEvent = (ConfirmExitOnboardingFlowViewEvent) obj;
                if (Intrinsics.areEqual(confirmExitOnboardingFlowViewEvent, ConfirmExitOnboardingFlowViewEvent.ExitFlow.INSTANCE)) {
                    screenNavigator7.goTo(((RealFlowStarter) ((FlowStarter) errorPresenter2.args)).signOut());
                } else {
                    if (!Intrinsics.areEqual(confirmExitOnboardingFlowViewEvent, ConfirmExitOnboardingFlowViewEvent.Continue.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    NavAction$$ExternalSyntheticOutline0.m((Object) null, screenNavigator7);
                }
                return Unit.INSTANCE;
            case 13:
                ConfirmHelpPresenter confirmHelpPresenter = (ConfirmHelpPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator8 = confirmHelpPresenter.navigator;
                ConfirmHelpViewEvent confirmHelpViewEvent = (ConfirmHelpViewEvent) obj;
                if (Intrinsics.areEqual(confirmHelpViewEvent, ConfirmHelpViewEvent.Confirm.INSTANCE)) {
                    screenNavigator8.goTo(new Finish(HelpItem.copy$default(confirmHelpPresenter.args.item, null, null, null, 4063)));
                } else {
                    if (!Intrinsics.areEqual(confirmHelpViewEvent, ConfirmHelpViewEvent.Cancel.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    NavAction$$ExternalSyntheticOutline0.m((Object) null, screenNavigator8);
                }
                return Unit.INSTANCE;
            case 14:
                ErrorPresenter errorPresenter3 = (ErrorPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator9 = (BetterNavigator.ScreenNavigator) errorPresenter3.navigator;
                ConfirmableOptionViewEvent confirmableOptionViewEvent = (ConfirmableOptionViewEvent) obj;
                if (Intrinsics.areEqual(confirmableOptionViewEvent, ConfirmableOptionViewEvent.Cancel.INSTANCE)) {
                    screenNavigator9.goTo(back);
                } else {
                    if (!Intrinsics.areEqual(confirmableOptionViewEvent, ConfirmableOptionViewEvent.Confirm.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    BlockersScreens.ConfirmableOptionDialog confirmableOptionDialog = (BlockersScreens.ConfirmableOptionDialog) errorPresenter3.args;
                    screenNavigator9.goTo(new Finish(new BlockersScreens.OptionPickerConfirmationResult(confirmableOptionDialog.formElementId, confirmableOptionDialog.optionId)));
                }
                return Unit.INSTANCE;
            case 15:
                if (Intrinsics.areEqual((ErrorViewEvent$Close) obj, ErrorViewEvent$Close.INSTANCE)) {
                    NavAction$$ExternalSyntheticOutline0.m((Object) null, (BetterNavigator.ScreenNavigator) ((ErrorPresenter) obj2).navigator);
                    return Unit.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 16:
                BetterNavigator.ScreenNavigator screenNavigator10 = (BetterNavigator.ScreenNavigator) ((EndAppLockPresenter) obj2).accountOutboundNavigator;
                FileBlockerExplanationViewEvent fileBlockerExplanationViewEvent = (FileBlockerExplanationViewEvent) obj;
                if (Intrinsics.areEqual(fileBlockerExplanationViewEvent, FileBlockerExplanationViewEvent.Cancel.INSTANCE)) {
                    screenNavigator10.goTo(new Finish(FileBlockerExplanationResult$Negative.INSTANCE));
                } else {
                    if (!Intrinsics.areEqual(fileBlockerExplanationViewEvent, FileBlockerExplanationViewEvent.Confirm.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator10.goTo(new Finish(FileBlockerExplanationResult$Positive.INSTANCE));
                }
                return Unit.INSTANCE;
            case 17:
                BetterNavigator.ScreenNavigator screenNavigator11 = (BetterNavigator.ScreenNavigator) ((ErrorPresenter) obj2).navigator;
                FilesetUploadErrorViewEvent filesetUploadErrorViewEvent = (FilesetUploadErrorViewEvent) obj;
                if (Intrinsics.areEqual(filesetUploadErrorViewEvent, FilesetUploadErrorViewEvent.Cancel.INSTANCE)) {
                    screenNavigator11.goTo(new Finish(FilesetUploadErrorResult$Negative.INSTANCE));
                } else {
                    if (!Intrinsics.areEqual(filesetUploadErrorViewEvent, FilesetUploadErrorViewEvent.Retry.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator11.goTo(new Finish(FilesetUploadErrorResult$Positive.INSTANCE));
                }
                return Unit.INSTANCE;
            case 18:
                if (Intrinsics.areEqual((FilesetUploadLoadingViewEvent$Cancel) obj, FilesetUploadLoadingViewEvent$Cancel.INSTANCE)) {
                    ((AddAliasPresenter) obj2).navigator.goTo(new Finish(FilesetUploadLoadingResult$Negative.INSTANCE));
                    return Unit.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 19:
                FilesetUploadOptionsViewEvent filesetUploadOptionsViewEvent = (FilesetUploadOptionsViewEvent) obj;
                if (Intrinsics.areEqual(filesetUploadOptionsViewEvent, FilesetUploadOptionsViewEvent.Close.INSTANCE)) {
                    filesetUploadOptionsSheetResult = FilesetUploadOptionsSheetResult.CLOSE;
                } else {
                    if (!(filesetUploadOptionsViewEvent instanceof FilesetUploadOptionsViewEvent.Complete)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    filesetUploadOptionsSheetResult = ((FilesetUploadOptionsViewEvent.Complete) filesetUploadOptionsViewEvent).result;
                }
                ((AddAliasPresenter) obj2).navigator.goTo(new Finish(filesetUploadOptionsSheetResult));
                return Unit.INSTANCE;
            case 20:
                ((Boolean) obj).getClass();
                ((KClassImpl$Data$$Lambda$23) obj2).invoke();
                return Unit.INSTANCE;
            case 21:
                ((ConvertFromJavaKt$$Lambda$4) obj2).invoke();
                return Unit.INSTANCE;
            case 22:
                FormMenuActionViewEvent$ActionClick formMenuActionViewEvent$ActionClick = (FormMenuActionViewEvent$ActionClick) obj;
                if (formMenuActionViewEvent$ActionClick != null) {
                    ((FormMenuActionPresenter) obj2).navigator.goTo(new Finish(formMenuActionViewEvent$ActionClick.action));
                    return Unit.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 23:
                LocalPosCheckInPresenter localPosCheckInPresenter = (LocalPosCheckInPresenter) obj2;
                BlockersScreens.StartFlowEntryPoint startFlowEntryPoint = (BlockersScreens.StartFlowEntryPoint) localPosCheckInPresenter.cameraPermissions;
                if (!Intrinsics.areEqual((GetFlowLoadingViewEvent$HandleError) obj, GetFlowLoadingViewEvent$HandleError.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                if (startFlowEntryPoint.getOnErrorExitScreen() != null) {
                    BetterNavigator.ScreenNavigator screenNavigator12 = (BetterNavigator.ScreenNavigator) localPosCheckInPresenter.navigator;
                    Screen onErrorExitScreen = startFlowEntryPoint.getOnErrorExitScreen();
                    onErrorExitScreen.getClass();
                    screenNavigator12.goTo(onErrorExitScreen);
                } else {
                    ((AndroidActivityFinisher) localPosCheckInPresenter.launcher).finish();
                }
                return Unit.INSTANCE;
            case 24:
                GpsExplainerSheetPresenter gpsExplainerSheetPresenter = (GpsExplainerSheetPresenter) obj2;
                GpsExplainerViewEvent gpsExplainerViewEvent = (GpsExplainerViewEvent) obj;
                if (Intrinsics.areEqual(gpsExplainerViewEvent, GpsExplainerViewEvent.CloseClicked.INSTANCE)) {
                    gpsExplainerSheetPresenter.navigator.goTo(back);
                } else {
                    if (!(gpsExplainerViewEvent instanceof GpsExplainerViewEvent.UrlClicked)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    gpsExplainerSheetPresenter.router.route(new RoutingParams(null, null, null, null, null, null, 511), ((GpsExplainerViewEvent.UrlClicked) gpsExplainerViewEvent).url);
                }
                return Unit.INSTANCE;
            case 25:
                if (Intrinsics.areEqual((HelpItemMessageViewEvent$Cancel) obj, HelpItemMessageViewEvent$Cancel.INSTANCE)) {
                    ((BetterNavigator.ScreenNavigator) ((ErrorPresenter) obj2).navigator).goTo(back);
                    return Unit.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 26:
                EndAppLockPresenter endAppLockPresenter = (EndAppLockPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator13 = (BetterNavigator.ScreenNavigator) endAppLockPresenter.navigatorSwitcher;
                HelpOptionsViewEvent helpOptionsViewEvent = (HelpOptionsViewEvent) obj;
                if (Intrinsics.areEqual(helpOptionsViewEvent, HelpOptionsViewEvent.CancelClick.INSTANCE)) {
                    screenNavigator13.goTo(back);
                } else {
                    if (!(helpOptionsViewEvent instanceof HelpOptionsViewEvent.OptionSelected)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator13.goTo(new Finish((Parcelable) ((List) endAppLockPresenter.accountOutboundNavigator).get(((HelpOptionsViewEvent.OptionSelected) helpOptionsViewEvent).helpItemPosition)));
                }
                return Unit.INSTANCE;
            case 27:
                BetterNavigator.ScreenNavigator screenNavigator14 = (BetterNavigator.ScreenNavigator) ((ErrorPresenter) obj2).navigator;
                IneligibleMergeViewEvent ineligibleMergeViewEvent = (IneligibleMergeViewEvent) obj;
                if (Intrinsics.areEqual(ineligibleMergeViewEvent, IneligibleMergeViewEvent.Cancel.INSTANCE)) {
                    screenNavigator14.goTo(new Finish(IneligibleMergeResult.Negative.INSTANCE));
                } else {
                    if (!Intrinsics.areEqual(ineligibleMergeViewEvent, IneligibleMergeViewEvent.Confirm.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator14.goTo(new Finish(IneligibleMergeResult.Positive.INSTANCE));
                }
                return Unit.INSTANCE;
            case 28:
                if (Intrinsics.areEqual((InstrumentSelectionDetailsViewEvent$Confirm) obj, InstrumentSelectionDetailsViewEvent$Confirm.INSTANCE)) {
                    NavAction$$ExternalSyntheticOutline0.m((Object) null, (BetterNavigator.ScreenNavigator) ((ErrorPresenter) obj2).navigator);
                    return Unit.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            default:
                BetterNavigator.ScreenNavigator screenNavigator15 = (BetterNavigator.ScreenNavigator) ((ErrorPresenter) obj2).navigator;
                InstrumentSelectionDetailsSheetViewEvent instrumentSelectionDetailsSheetViewEvent = (InstrumentSelectionDetailsSheetViewEvent) obj;
                if (instrumentSelectionDetailsSheetViewEvent instanceof InstrumentSelectionDetailsSheetViewEvent.Close) {
                    screenNavigator15.goTo(new Finish(BlockersScreens.InstrumentSelectionDetailsScreen.Result.Cancel.INSTANCE));
                } else {
                    if (!(instrumentSelectionDetailsSheetViewEvent instanceof InstrumentSelectionDetailsSheetViewEvent.Continue)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    InstrumentSelectionDetailsSheetViewEvent.Continue r13 = (InstrumentSelectionDetailsSheetViewEvent.Continue) instrumentSelectionDetailsSheetViewEvent;
                    screenNavigator15.goTo(new Finish(new BlockersScreens.InstrumentSelectionDetailsScreen.Result.InstrumentResult(r13.id, r13.continueButtonAction)));
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ClientScenarioLauncherPresenter$models$1$1$1(CoroutineScope coroutineScope, MoleculePresenter moleculePresenter, int i) {
        this.$r8$classId = i;
        this.this$0 = moleculePresenter;
    }
}
