package com.squareup.cash.checks;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.camera.video.internal.config.AudioConfigUtil;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.history.screens.HistoryScreens;
import app.cash.molecule.PlatformKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzanl;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.ActivityItemKt;
import com.squareup.cash.activity.backend.RealActivityFeedProducer;
import com.squareup.cash.activity.presenters.ActivityEmbeddedPresenter$Companion;
import com.squareup.cash.activity.presenters.ActivityItemPresenter;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.activity.primitives.ActivityItemKey;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.card.onboarding.CardStudioPresenter$models$1$1;
import com.squareup.cash.cashapppay.settings.screens.ConfirmRemoveLinkedBusinessDialogScreen;
import com.squareup.cash.cashapppay.settings.viewmodels.RemoveLinkedBusinessViewModel;
import com.squareup.cash.checks.screens.VerifyCheckDialogScreen;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerFullScreen;
import com.squareup.cash.common.messaging.viewmodels.FailureMessageFullScreenViewModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.profile.RealProfileManager$setPhoto$2;
import com.squareup.cash.deposits.physical.screens.PhysicalDepositErrorScreen;
import com.squareup.cash.deposits.physical.viewmodels.error.PhysicalDepositErrorViewModel;
import com.squareup.cash.directdeposit.backend.api.PaycheckDepositAllocation;
import com.squareup.cash.directdeposit.screens.DirectDepositEditPaycheckAllocationScreen;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositEditPaycheckAmountViewModel;
import com.squareup.cash.directdeposit.viewmodels.PaycheckDepositAllocationType;
import com.squareup.cash.earnings.presenters.home.EarningsHomePresenter$models$3$1;
import com.squareup.cash.earnings.screens.home.EarningsActivityListScreen;
import com.squareup.cash.earnings.viewmodels.EarningsActivityListViewModel;
import com.squareup.cash.family.familyhub.screens.ControlDisablingConfirmationScreen;
import com.squareup.cash.family.familyhub.screens.ControlErrorScreen;
import com.squareup.cash.family.familyhub.screens.DependentDetailIntroductionDialog;
import com.squareup.cash.family.familyhub.screens.SetDependentCustomLimitErrorScreen;
import com.squareup.cash.family.familyhub.viewmodels.ControlDisablingConfirmationViewModel;
import com.squareup.cash.family.familyhub.viewmodels.ControlErrorViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentDetailIntroductionViewModel;
import com.squareup.cash.family.familyhub.viewmodels.SetDependentCustomLimitErrorViewModel;
import com.squareup.cash.family.requestsponsorship.screens.ContactPermissionDialogScreen;
import com.squareup.cash.family.requestsponsorship.screens.SelectSponsorErrorScreen;
import com.squareup.cash.family.requestsponsorship.viewmodels.ContactPermissionDialogViewModel;
import com.squareup.cash.family.requestsponsorship.viewmodels.SelectSponsorErrorViewModel;
import com.squareup.cash.family.safetyhub.screens.SafetyHubScreens;
import com.squareup.cash.family.safetyhub.viewmodels.SafetyEducationPageViewModel;
import com.squareup.cash.family.safetyhub.viewmodels.SafetyHubViewModel;
import com.squareup.cash.favorites.screens.FavoritesMessage;
import com.squareup.cash.favorites.viewmodels.FavoritesMessageViewModel;
import com.squareup.cash.fidesmo.real.RealFidesmoClient$observeDeviceState$1;
import com.squareup.cash.formview.components.FormCashtag;
import com.squareup.cash.google.pay.GooglePayPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.history.presenters.PasscodeDialogPresenter$models$1$1;
import com.squareup.cash.history.viewmodels.ErrorViewModel;
import com.squareup.cash.history.viewmodels.TreehouseReceiptViewModel;
import com.squareup.cash.investing.components.InvestingHomeView$onScrollFlow$1;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.InvestingExplanatoryViewModel;
import com.squareup.cash.investing.viewmodels.ordertype.autoinvest.DependentAutoInvestInfoViewModel;
import com.squareup.cash.invitations.InviteContactsPresenter$special$$inlined$map$1;
import com.squareup.cash.invitations.InviteErrorPresenter$models$1$1;
import com.squareup.cash.maps.presenter.CashMapPresenter$models$3$1;
import com.squareup.cash.marketing.components.TooltipBoxKt$$ExternalSyntheticLambda2;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewModel;
import com.squareup.cash.money.applets.sections.RealPromotedAppletTileStore;
import com.squareup.cash.money.core.ids.AppletId;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$31$$inlined$map$1;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda1;
import com.squareup.cash.moneybot.presenters.MoneybotAmountInputPresenterKt$WhenMappings;
import com.squareup.cash.moneybot.screens.MoneybotAmountInputQuestion;
import com.squareup.cash.moneybot.screens.MoneybotAmountInputScreen;
import com.squareup.cash.moneybot.screens.MoneybotAutomationsScreen;
import com.squareup.cash.moneybot.screens.MoneybotTextInputQuestion;
import com.squareup.cash.moneybot.screens.MoneybotTextInputScreen;
import com.squareup.cash.moneybot.viewmodels.MoneybotAutomationsViewModel$Empty;
import com.squareup.cash.moneybot.viewmodels.amountinput.MoneybotAmountInputViewModel;
import com.squareup.cash.moneybot.viewmodels.textinput.MoneybotTextInputViewModel;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import com.squareup.cash.nearby.screens.NearbyOrderedListsScreen;
import com.squareup.cash.nearby.viewmodels.NearbyOrderedListsViewModel;
import com.squareup.cash.offers.screens.OffersScreen$OffersNotificationScreen;
import com.squareup.cash.offers.viewmodels.OffersNotificationViewModel;
import com.squareup.cash.onboarding.accountpicker.screens.OnboardingAccountPickerErrorScreen;
import com.squareup.cash.onboarding.accountpicker.screens.OnboardingConfirmAccountRemovalScreen;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AccountPickerErrorViewModel;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda2;
import com.squareup.cash.paychecks.backend.api.model.PaychecksAlertUi;
import com.squareup.cash.paychecks.screens.OverallocationAlertDialogScreen;
import com.squareup.cash.paychecks.screens.PaycheckAlertDialogScreen;
import com.squareup.cash.paychecks.viewmodels.PaycheckAlertDialogViewModel;
import com.squareup.cash.payments.presenters.MainPaymentPresenter$models$4$4;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.DbSessionManager$updateDb$2;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter$Factory$Impl;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.cash.upsell.presenters.NullStateSwipeConfigProvider;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.cash.activity.api.v1.ActivityItemGlobalId;
import com.squareup.protos.cash.activity.api.v1.ActivityItemId;
import com.squareup.protos.cash.activity.api.v1.ActivityItemType;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.util.android.AndroidActivityFinisher;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;

/* loaded from: classes6.dex */
public final class VerifyCheckDialogPresenter implements MoleculePresenter {
    public final /* synthetic */ int $r8$classId;
    public final Object args;
    public final Object navigator;

    public VerifyCheckDialogPresenter(SessionManager sessionManager, AndroidStringManager androidStringManager, EarningsActivityListScreen earningsActivityListScreen, BetterNavigator.ScreenNavigator screenNavigator, RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl, ActivityItemPresenter.Factory factory, RealActivityFeedProducer realActivityFeedProducer) {
        this.$r8$classId = 5;
        earningsActivityListScreen.getClass();
        this.navigator = screenNavigator;
        this.args = realActivityEmbeddedPresenter$Factory$Impl.create(screenNavigator, ActivityEmbeddedPresenter$Companion.FilteredFeedConfiguration$default(zzanl.earningsActivityContext$default(4, PlatformKt.activeAccountToken(sessionManager), earningsActivityListScreen.streamIdentifier), null, null, false, androidStringManager.get(R.string.earnings_activity_list_empty), null, factory, null, realActivityFeedProducer, 11130));
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x02a4, code lost:
    
        if (r4 == null) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        PaycheckDepositAllocationType paycheckDepositAllocationType;
        String str;
        ActivityItemId activityItemId;
        ActivityItemId activityItemId2;
        ActivityItemType activityItemType;
        int i2 = this.$r8$classId;
        Object obj = this.navigator;
        int i3 = 18;
        int i4 = 1;
        int i5 = 13;
        int i6 = 19;
        int i7 = 4;
        int i8 = 2;
        int i9 = 7;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        String str2 = 0;
        str2 = 0;
        Object obj2 = this.args;
        switch (i2) {
            case 0:
                flow.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(1359729300);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == neverEqualPolicy) {
                    VerifyCheckDialogScreen verifyCheckDialogScreen = (VerifyCheckDialogScreen) obj2;
                    rememberedValue = new VerifyCheckDialogViewModel(verifyCheckDialogScreen.title, verifyCheckDialogScreen.message, verifyCheckDialogScreen.positiveLabel, verifyCheckDialogScreen.negativeLabel);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                VerifyCheckDialogViewModel verifyCheckDialogViewModel = (VerifyCheckDialogViewModel) rememberedValue;
                Updater.LaunchedEffect(gapComposer, flow, new RealProfileManager$setPhoto$2(flow, (Continuation) str2, this, i8));
                gapComposer.end(false);
                return verifyCheckDialogViewModel;
            case 1:
                flow.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(1808362841);
                Updater.LaunchedEffect(gapComposer2, flow, new CardStudioPresenter$models$1$1(flow, (Continuation) str2, this, 27));
                ConfirmRemoveLinkedBusinessDialogScreen confirmRemoveLinkedBusinessDialogScreen = (ConfirmRemoveLinkedBusinessDialogScreen) obj2;
                RemoveLinkedBusinessViewModel removeLinkedBusinessViewModel = new RemoveLinkedBusinessViewModel(confirmRemoveLinkedBusinessDialogScreen.actionType, confirmRemoveLinkedBusinessDialogScreen.name);
                gapComposer2.end(false);
                return removeLinkedBusinessViewModel;
            case 2:
                flow.getClass();
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startReplaceGroup(-436965316);
                Updater.LaunchedEffect(gapComposer3, flow, new RealProfileManager$setPhoto$2(flow, (Continuation) str2, this, i9));
                FailureMessageBlockerFullScreen failureMessageBlockerFullScreen = (FailureMessageBlockerFullScreen) obj2;
                FailureMessageFullScreenViewModel failureMessageFullScreenViewModel = new FailureMessageFullScreenViewModel(failureMessageBlockerFullScreen.title, failureMessageBlockerFullScreen.message, failureMessageBlockerFullScreen.finishAppOnDismiss);
                gapComposer3.end(false);
                return failureMessageFullScreenViewModel;
            case 3:
                flow.getClass();
                GapComposer gapComposer4 = (GapComposer) composer;
                gapComposer4.startReplaceGroup(-515483281);
                Updater.LaunchedEffect(gapComposer4, flow, new RealProfileManager$setPhoto$2(flow, (Continuation) str2, this, 25));
                PhysicalDepositErrorScreen physicalDepositErrorScreen = (PhysicalDepositErrorScreen) obj2;
                PhysicalDepositErrorViewModel physicalDepositErrorViewModel = new PhysicalDepositErrorViewModel(physicalDepositErrorScreen.title, physicalDepositErrorScreen.details, physicalDepositErrorScreen.actionPositiveText, physicalDepositErrorScreen.actionNegativeText);
                gapComposer4.end(false);
                return physicalDepositErrorViewModel;
            case 4:
                flow.getClass();
                GapComposer gapComposer5 = (GapComposer) composer;
                gapComposer5.startReplaceGroup(-1980270213);
                Object rememberedValue2 = gapComposer5.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    PaycheckDepositAllocation paycheckDepositAllocation = ((DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion) ((DirectDepositEditPaycheckAllocationScreen) obj2).question.question).paycheckDepositAllocation;
                    if (Intrinsics.areEqual(paycheckDepositAllocation, PaycheckDepositAllocation.All.INSTANCE)) {
                        paycheckDepositAllocationType = PaycheckDepositAllocationType.ALL;
                    } else if (paycheckDepositAllocation instanceof PaycheckDepositAllocation.CurrencyAmount) {
                        paycheckDepositAllocationType = PaycheckDepositAllocationType.CURRENCY_AMOUNT;
                    } else {
                        if (!(paycheckDepositAllocation instanceof PaycheckDepositAllocation.Percentage)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        paycheckDepositAllocationType = PaycheckDepositAllocationType.PERCENTAGE;
                    }
                    rememberedValue2 = Updater.mutableStateOf$default(paycheckDepositAllocationType);
                    gapComposer5.updateRememberedValue(rememberedValue2);
                }
                MutableState mutableState = (MutableState) rememberedValue2;
                Updater.LaunchedEffect(gapComposer5, flow, new VerifyCheckDepositPresenter$models$3$1(flow, (Continuation) null, (MoleculePresenter) this, mutableState, 25));
                DirectDepositEditPaycheckAmountViewModel directDepositEditPaycheckAmountViewModel = new DirectDepositEditPaycheckAmountViewModel((PaycheckDepositAllocationType) mutableState.getValue());
                gapComposer5.end(false);
                return directDepositEditPaycheckAmountViewModel;
            case 5:
                flow.getClass();
                GapComposer gapComposer6 = (GapComposer) composer;
                gapComposer6.startReplaceGroup(1682816870);
                Updater.LaunchedEffect(gapComposer6, flow, new EarningsHomePresenter$models$3$1(flow, (Continuation) str2, this, i7));
                EarningsActivityListViewModel earningsActivityListViewModel = new EarningsActivityListViewModel(((RealActivityEmbeddedPresenter) obj2).models(gapComposer6, 0));
                gapComposer6.end(false);
                return earningsActivityListViewModel;
            case 6:
                flow.getClass();
                GapComposer gapComposer7 = (GapComposer) composer;
                gapComposer7.startReplaceGroup(-362631423);
                Updater.LaunchedEffect(gapComposer7, flow, new EarningsHomePresenter$models$3$1(flow, (Continuation) str2, this, i3));
                ControlDisablingConfirmationScreen controlDisablingConfirmationScreen = (ControlDisablingConfirmationScreen) obj2;
                ControlDisablingConfirmationViewModel controlDisablingConfirmationViewModel = new ControlDisablingConfirmationViewModel(controlDisablingConfirmationScreen.title, controlDisablingConfirmationScreen.message, controlDisablingConfirmationScreen.confirmButtonText, controlDisablingConfirmationScreen.cancelButtonText, controlDisablingConfirmationScreen.showDarkConfirm);
                gapComposer7.end(false);
                return controlDisablingConfirmationViewModel;
            case 7:
                flow.getClass();
                GapComposer gapComposer8 = (GapComposer) composer;
                gapComposer8.startReplaceGroup(330138867);
                Updater.LaunchedEffect(gapComposer8, flow, new EarningsHomePresenter$models$3$1(flow, (Continuation) str2, this, i6));
                ControlErrorScreen controlErrorScreen = (ControlErrorScreen) obj2;
                ControlErrorViewModel controlErrorViewModel = new ControlErrorViewModel(controlErrorScreen.title, controlErrorScreen.message, controlErrorScreen.buttonText);
                gapComposer8.end(false);
                return controlErrorViewModel;
            case 8:
                flow.getClass();
                GapComposer gapComposer9 = (GapComposer) composer;
                gapComposer9.startReplaceGroup(2010988682);
                Updater.LaunchedEffect(gapComposer9, flow, new EarningsHomePresenter$models$3$1(flow, (Continuation) str2, this, 21));
                DependentDetailIntroductionDialog dependentDetailIntroductionDialog = (DependentDetailIntroductionDialog) obj2;
                DependentDetailIntroductionViewModel dependentDetailIntroductionViewModel = new DependentDetailIntroductionViewModel(dependentDetailIntroductionDialog.image, dependentDetailIntroductionDialog.title, dependentDetailIntroductionDialog.message, dependentDetailIntroductionDialog.dismissButtonLabel);
                gapComposer9.end(false);
                return dependentDetailIntroductionViewModel;
            case 9:
                flow.getClass();
                GapComposer gapComposer10 = (GapComposer) composer;
                gapComposer10.startReplaceGroup(555253603);
                Updater.LaunchedEffect(gapComposer10, flow, new EarningsHomePresenter$models$3$1(flow, (Continuation) str2, this, 26));
                SetDependentCustomLimitErrorScreen setDependentCustomLimitErrorScreen = (SetDependentCustomLimitErrorScreen) obj2;
                SetDependentCustomLimitErrorViewModel setDependentCustomLimitErrorViewModel = new SetDependentCustomLimitErrorViewModel(setDependentCustomLimitErrorScreen.title, setDependentCustomLimitErrorScreen.message, setDependentCustomLimitErrorScreen.positiveButtonText);
                gapComposer10.end(false);
                return setDependentCustomLimitErrorViewModel;
            case 10:
                flow.getClass();
                GapComposer gapComposer11 = (GapComposer) composer;
                gapComposer11.startReplaceGroup(660673911);
                Updater.LaunchedEffect(gapComposer11, flow, new AnimationsKt$takeUntil$1$1.AnonymousClass1(flow, (Continuation) str2, this, i8));
                ContactPermissionDialogScreen contactPermissionDialogScreen = (ContactPermissionDialogScreen) obj2;
                String str3 = contactPermissionDialogScreen.title;
                str3.getClass();
                String str4 = contactPermissionDialogScreen.body;
                str4.getClass();
                String str5 = contactPermissionDialogScreen.addContactButtonTitle;
                str5.getClass();
                String str6 = contactPermissionDialogScreen.dismissButtonTitle;
                str6.getClass();
                ContactPermissionDialogViewModel contactPermissionDialogViewModel = new ContactPermissionDialogViewModel(str3, str4, str5, str6);
                gapComposer11.end(false);
                return contactPermissionDialogViewModel;
            case 11:
                flow.getClass();
                GapComposer gapComposer12 = (GapComposer) composer;
                gapComposer12.startReplaceGroup(1440850716);
                Updater.LaunchedEffect(gapComposer12, flow, new AnimationsKt$takeUntil$1$1.AnonymousClass1(flow, (Continuation) str2, this, i7));
                SelectSponsorErrorViewModel selectSponsorErrorViewModel = new SelectSponsorErrorViewModel(((SelectSponsorErrorScreen) obj2).message);
                gapComposer12.end(false);
                return selectSponsorErrorViewModel;
            case 12:
                flow.getClass();
                GapComposer gapComposer13 = (GapComposer) composer;
                gapComposer13.startReplaceGroup(143738167);
                Updater.LaunchedEffect(gapComposer13, flow, new AnimationsKt$takeUntil$1$1.AnonymousClass1(flow, (Continuation) str2, this, i9));
                SafetyEducationPageViewModel safetyEducationPageViewModel = new SafetyEducationPageViewModel(((SafetyHubScreens.SafetyEducationPageScreen) obj2).page);
                gapComposer13.end(false);
                return safetyEducationPageViewModel;
            case 13:
                flow.getClass();
                GapComposer gapComposer14 = (GapComposer) composer;
                gapComposer14.startReplaceGroup(131107605);
                Object rememberedValue3 = gapComposer14.rememberedValue();
                if (rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = Updater.mutableStateOf$default(SafetyHubViewModel.Loading.INSTANCE);
                    gapComposer14.updateRememberedValue(rememberedValue3);
                }
                MutableState mutableState2 = (MutableState) rememberedValue3;
                Unit unit = Unit.INSTANCE;
                boolean changedInstance = gapComposer14.changedInstance(this);
                Object rememberedValue4 = gapComposer14.rememberedValue();
                Continuation continuation = null;
                if (changedInstance || rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new FormCashtag.AnonymousClass8.AnonymousClass2(this, mutableState2, continuation, i5);
                    gapComposer14.updateRememberedValue(rememberedValue4);
                }
                Updater.LaunchedEffect(gapComposer14, unit, (Function2) rememberedValue4);
                Updater.LaunchedEffect(gapComposer14, flow, new RealFidesmoClient$observeDeviceState$1(flow, continuation, this, mutableState2, 19));
                SafetyHubViewModel safetyHubViewModel = (SafetyHubViewModel) mutableState2.getValue();
                gapComposer14.end(false);
                return safetyHubViewModel;
            case 14:
                flow.getClass();
                GapComposer gapComposer15 = (GapComposer) composer;
                gapComposer15.startReplaceGroup(522822408);
                Updater.LaunchedEffect(gapComposer15, flow, new AnimationsKt$takeUntil$1$1.AnonymousClass1(flow, (Continuation) str2, this, 9));
                FavoritesMessage favoritesMessage = (FavoritesMessage) obj2;
                FavoritesMessageViewModel favoritesMessageViewModel = new FavoritesMessageViewModel(favoritesMessage.title, favoritesMessage.message);
                gapComposer15.end(false);
                return favoritesMessageViewModel;
            case 15:
                m3467models(flow, composer, i);
                return Unit.INSTANCE;
            case 16:
                flow.getClass();
                GapComposer gapComposer16 = (GapComposer) composer;
                gapComposer16.startReplaceGroup(644661515);
                Updater.LaunchedEffect(gapComposer16, flow, new PasscodeDialogPresenter$models$1$1(flow, (Continuation) str2, this, i9));
                ErrorViewModel errorViewModel = new ErrorViewModel((String) ((HistoryScreens.Error) obj2).message.getValue());
                gapComposer16.end(false);
                return errorViewModel;
            case 17:
                flow.getClass();
                GapComposer gapComposer17 = (GapComposer) composer;
                gapComposer17.startReplaceGroup(-1508327971);
                HistoryScreens.PaymentReceipt paymentReceipt = (HistoryScreens.PaymentReceipt) obj2;
                ActivityItemGlobalId activityItemGlobalId = paymentReceipt.activityItemKey.activityItemGlobalId;
                activityItemGlobalId.getClass();
                ActivityItemGlobalId.ActivityId activityId = activityItemGlobalId.activity_id;
                if (activityId != null) {
                    ActivityItemGlobalId.ActivityId.ActivityRowId activityRowId = activityId instanceof ActivityItemGlobalId.ActivityId.ActivityRowId ? (ActivityItemGlobalId.ActivityId.ActivityRowId) activityId : null;
                    if (activityRowId == null) {
                        str = null;
                        break;
                    } else {
                        str = activityRowId.getValue();
                        break;
                    }
                }
                ActivityItemGlobalId.ActivityId activityId2 = activityItemGlobalId.activity_id;
                Object valueOf = (activityId2 == null || (activityItemId2 = ActivityItemKt.getActivityItemId(activityId2)) == null || (activityItemType = activityItemId2.type) == null) ? null : Integer.valueOf(activityItemType.getValue());
                ActivityItemGlobalId.ActivityId activityId3 = activityItemGlobalId.activity_id;
                if (activityId3 != null && (activityItemId = ActivityItemKt.getActivityItemId(activityId3)) != null) {
                    str2 = activityItemId.id;
                }
                str = valueOf + "-" + str2;
                ActivityItemKey activityItemKey = paymentReceipt.activityItemKey;
                TreehouseReceiptViewModel treehouseReceiptViewModel = new TreehouseReceiptViewModel(str, (BetterNavigator.ScreenNavigator) obj, activityItemKey.activityToken, activityItemKey.activityItemGlobalId.primary_activity_token, activityItemKey.activityScope, paymentReceipt.encodedExitUrl, paymentReceipt.locale);
                gapComposer17.end(false);
                return treehouseReceiptViewModel;
            case 18:
                flow.getClass();
                GapComposer gapComposer18 = (GapComposer) composer;
                gapComposer18.startReplaceGroup(2059840432);
                Updater.LaunchedEffect(gapComposer18, flow, new InvestingHomeView$onScrollFlow$1(flow, (Continuation) str2, this, i9));
                InvestingExplanatoryViewModel investingExplanatoryViewModel = new InvestingExplanatoryViewModel(((InvestingScreens.InvestingExplanatoryDialogScreen) obj2).content);
                gapComposer18.end(false);
                return investingExplanatoryViewModel;
            case 19:
                flow.getClass();
                GapComposer gapComposer19 = (GapComposer) composer;
                gapComposer19.startReplaceGroup(-451916905);
                AndroidStringManager androidStringManager = (AndroidStringManager) obj2;
                String str7 = androidStringManager.get(R.string.dependent_auto_invest_bottom_sheet_title);
                String str8 = ((InvestingScreens.DependentAutoInvestBottomSheet) obj).dependentName;
                str8.getClass();
                Resources resources = androidStringManager.resources;
                resources.getClass();
                String format2 = new MessageFormat(resources.getString(R.string.dependent_auto_invest_bottom_sheet_description)).format(new Object[]{str8});
                format2.getClass();
                DependentAutoInvestInfoViewModel dependentAutoInvestInfoViewModel = new DependentAutoInvestInfoViewModel(str7, format2);
                gapComposer19.end(false);
                return dependentAutoInvestInfoViewModel;
            case 20:
                m3467models(flow, composer, i);
                return Unit.INSTANCE;
            case 21:
                return models(flow, composer);
            case 22:
                flow.getClass();
                GapComposer gapComposer20 = (GapComposer) composer;
                gapComposer20.startReplaceGroup(-929617973);
                MoneybotAmountInputQuestion moneybotAmountInputQuestion = (MoneybotAmountInputQuestion) ((MoneybotAmountInputScreen) obj2).askedQuestion.question;
                Money money = moneybotAmountInputQuestion.initialAmount;
                CurrencyCode currencyCode = money.currency_code;
                if (currencyCode == null) {
                    currencyCode = CurrencyCode.USD;
                }
                Object rememberedValue5 = gapComposer20.rememberedValue();
                if (rememberedValue5 == neverEqualPolicy) {
                    int log10 = (int) Math.log10(Moneys.displayDivisor(currencyCode));
                    Long l = money.amount;
                    String plainString = BigDecimal.valueOf(l != null ? l.longValue() : 0L, log10).stripTrailingZeros().toPlainString();
                    plainString.getClass();
                    rememberedValue5 = Updater.mutableStateOf$default(plainString);
                    gapComposer20.updateRememberedValue(rememberedValue5);
                }
                MutableState mutableState3 = (MutableState) rememberedValue5;
                Object rememberedValue6 = gapComposer20.rememberedValue();
                if (rememberedValue6 == neverEqualPolicy) {
                    rememberedValue6 = Updater.mutableStateOf$default(Moneys.parseMoneyFromString$default((String) mutableState3.getValue(), currencyCode));
                    gapComposer20.updateRememberedValue(rememberedValue6);
                }
                MutableState mutableState4 = (MutableState) rememberedValue6;
                CurrencyCode currencyCode2 = currencyCode;
                Updater.LaunchedEffect(gapComposer20, flow, new DbSessionManager$updateDb$2(flow, null, currencyCode2, moneybotAmountInputQuestion, this, mutableState3, mutableState4, 13));
                String str9 = (String) mutableState3.getValue();
                AmountConfig.MoneyConfig moneyConfig = MoneybotAmountInputPresenterKt$WhenMappings.$EnumSwitchMapping$0[currencyCode2.ordinal()] == 1 ? new AmountConfig.MoneyConfig(currencyCode2, BitcoinDisplayUnits.BITCOIN, false, 0, 12) : new AmountConfig.MoneyConfig(currencyCode2, null, false, 0, 14);
                boolean access$isValid = AudioConfigUtil.access$isValid((Money) mutableState4.getValue(), moneybotAmountInputQuestion.minAmount, moneybotAmountInputQuestion.maxAmount);
                String str10 = moneybotAmountInputQuestion.title;
                String str11 = moneybotAmountInputQuestion.subtitle;
                String str12 = moneybotAmountInputQuestion.cta;
                MoneybotAmountInputViewModel moneybotAmountInputViewModel = new MoneybotAmountInputViewModel(str9, moneyConfig, access$isValid, str10, str11, (str12 == null || StringsKt.isBlank(str12)) ? null : str12);
                gapComposer20.end(false);
                return moneybotAmountInputViewModel;
            case 23:
                flow.getClass();
                GapComposer gapComposer21 = (GapComposer) composer;
                gapComposer21.startReplaceGroup(178290805);
                Updater.LaunchedEffect(gapComposer21, flow, new CashMapPresenter$models$3$1(flow, (Continuation) str2, this, i3));
                Object rememberedValue7 = gapComposer21.rememberedValue();
                if (rememberedValue7 == neverEqualPolicy) {
                    NullStateSwipeConfigProvider nullStateSwipeConfigProvider = new NullStateSwipeConfigProvider(new MoneyTabPresenter$models$lambda$31$$inlined$map$1(flow, 8), i7);
                    gapComposer21.updateRememberedValue(nullStateSwipeConfigProvider);
                    rememberedValue7 = nullStateSwipeConfigProvider;
                }
                MoneybotAutomationsViewModel$Empty moneybotAutomationsViewModel$Empty = new MoneybotAutomationsViewModel$Empty(((TabToolbarPresenter) obj2).models((Flow) rememberedValue7, (Composer) gapComposer21, 0), CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"Set a reminder", "Save on a schedule", "Send a regular payment", "Buy stocks or bitcoin automatically", "Something else"}));
                gapComposer21.end(false);
                return moneybotAutomationsViewModel$Empty;
            case 24:
                flow.getClass();
                GapComposer gapComposer22 = (GapComposer) composer;
                gapComposer22.startReplaceGroup(1641539126);
                MoneybotTextInputQuestion moneybotTextInputQuestion = (MoneybotTextInputQuestion) ((MoneybotTextInputScreen) obj2).askedQuestion.question;
                Updater.LaunchedEffect(gapComposer22, flow, new RealMRIFactory$sign$2(flow, (Continuation) str2, this, i4));
                MoneybotTextInputViewModel moneybotTextInputViewModel = new MoneybotTextInputViewModel(moneybotTextInputQuestion.maxLength, moneybotTextInputQuestion.initialText, moneybotTextInputQuestion.placeholder, moneybotTextInputQuestion.cta);
                gapComposer22.end(false);
                return moneybotTextInputViewModel;
            case 25:
                flow.getClass();
                GapComposer gapComposer23 = (GapComposer) composer;
                gapComposer23.startReplaceGroup(-1626444769);
                Updater.LaunchedEffect(gapComposer23, flow, new RealMRIFactory$sign$2(flow, (Continuation) str2, this, 6));
                NearbyOrderedListsScreen nearbyOrderedListsScreen = (NearbyOrderedListsScreen) obj2;
                NearbyOrderedListsViewModel nearbyOrderedListsViewModel = new NearbyOrderedListsViewModel(nearbyOrderedListsScreen.title, nearbyOrderedListsScreen.description, nearbyOrderedListsScreen.sections);
                gapComposer23.end(false);
                return nearbyOrderedListsViewModel;
            case 26:
                flow.getClass();
                GapComposer gapComposer24 = (GapComposer) composer;
                gapComposer24.startReplaceGroup(379160876);
                Updater.LaunchedEffect(gapComposer24, flow, new RealMRIFactory$sign$2(flow, (Continuation) str2, this, i5));
                OffersNotificationViewModel offersNotificationViewModel = (OffersNotificationViewModel) obj2;
                gapComposer24.end(false);
                return offersNotificationViewModel;
            case 27:
                flow.getClass();
                GapComposer gapComposer25 = (GapComposer) composer;
                gapComposer25.startReplaceGroup(-1152104336);
                Updater.LaunchedEffect(gapComposer25, flow, new RealMRIFactory$sign$2(flow, (Continuation) str2, this, i6));
                AccountPickerErrorViewModel accountPickerErrorViewModel = new AccountPickerErrorViewModel(((OnboardingAccountPickerErrorScreen) obj2).errorMessage);
                gapComposer25.end(false);
                return accountPickerErrorViewModel;
            case 28:
                m3467models(flow, composer, i);
                return Unit.INSTANCE;
            default:
                flow.getClass();
                GapComposer gapComposer26 = (GapComposer) composer;
                gapComposer26.startReplaceGroup(2066007558);
                Updater.LaunchedEffect(gapComposer26, flow, new MainPaymentPresenter$models$4$4(flow, (Continuation) str2, this, i8));
                PaychecksAlertUi paychecksAlertUi = ((OverallocationAlertDialogScreen) ((PaycheckAlertDialogScreen) obj2)).alert;
                PaycheckAlertDialogViewModel paycheckAlertDialogViewModel = new PaycheckAlertDialogViewModel(paychecksAlertUi.title, paychecksAlertUi.detail, new PaycheckAlertDialogViewModel.Button(paychecksAlertUi.acknowledgeText));
                gapComposer26.end(false);
                return paycheckAlertDialogViewModel;
        }
    }

    public VerifyCheckDialogPresenter(SelectSponsorErrorScreen selectSponsorErrorScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 11;
        selectSponsorErrorScreen.getClass();
        this.args = selectSponsorErrorScreen;
        this.navigator = screenNavigator;
    }

    public VerifyCheckDialogPresenter(Activity activity, BlockersScreens.GooglePayProvisioningExitScreen googlePayProvisioningExitScreen) {
        this.$r8$classId = 15;
        googlePayProvisioningExitScreen.getClass();
        this.args = activity;
        this.navigator = googlePayProvisioningExitScreen;
    }

    public VerifyCheckDialogPresenter(ControlErrorScreen controlErrorScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 7;
        controlErrorScreen.getClass();
        this.args = controlErrorScreen;
        this.navigator = screenNavigator;
    }

    public VerifyCheckDialogPresenter(DependentDetailIntroductionDialog dependentDetailIntroductionDialog, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 8;
        dependentDetailIntroductionDialog.getClass();
        this.args = dependentDetailIntroductionDialog;
        this.navigator = screenNavigator;
    }

    public VerifyCheckDialogPresenter(SetDependentCustomLimitErrorScreen setDependentCustomLimitErrorScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 9;
        setDependentCustomLimitErrorScreen.getClass();
        this.args = setDependentCustomLimitErrorScreen;
        this.navigator = screenNavigator;
    }

    public VerifyCheckDialogPresenter(SafetyHubScreens.SafetyEducationPageScreen safetyEducationPageScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 12;
        safetyEducationPageScreen.getClass();
        this.args = safetyEducationPageScreen;
        this.navigator = screenNavigator;
    }

    public VerifyCheckDialogPresenter(InvestingScreens.InvestingExplanatoryDialogScreen investingExplanatoryDialogScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 18;
        investingExplanatoryDialogScreen.getClass();
        this.args = investingExplanatoryDialogScreen;
        this.navigator = screenNavigator;
    }

    public VerifyCheckDialogPresenter(OnboardingAccountPickerErrorScreen onboardingAccountPickerErrorScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 27;
        onboardingAccountPickerErrorScreen.getClass();
        this.args = onboardingAccountPickerErrorScreen;
        this.navigator = screenNavigator;
    }

    public VerifyCheckDialogPresenter(AndroidStringManager androidStringManager, InvestingScreens.DependentAutoInvestBottomSheet dependentAutoInvestBottomSheet) {
        this.$r8$classId = 19;
        dependentAutoInvestBottomSheet.getClass();
        this.args = androidStringManager;
        this.navigator = dependentAutoInvestBottomSheet;
    }

    public VerifyCheckDialogPresenter(HistoryScreens.Error error, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 16;
        error.getClass();
        this.args = error;
        this.navigator = screenNavigator;
    }

    public VerifyCheckDialogPresenter(VerifyCheckDialogScreen verifyCheckDialogScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 0;
        verifyCheckDialogScreen.getClass();
        this.args = verifyCheckDialogScreen;
        this.navigator = screenNavigator;
    }

    public VerifyCheckDialogPresenter(ContactPermissionDialogScreen contactPermissionDialogScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 10;
        contactPermissionDialogScreen.getClass();
        this.args = contactPermissionDialogScreen;
        this.navigator = screenNavigator;
    }

    public VerifyCheckDialogPresenter(BetterNavigator.ScreenNavigator screenNavigator, OffersScreen$OffersNotificationScreen offersScreen$OffersNotificationScreen) {
        this.$r8$classId = 26;
        offersScreen$OffersNotificationScreen.getClass();
        this.navigator = screenNavigator;
        this.args = new OffersNotificationViewModel(offersScreen$OffersNotificationScreen.duration, offersScreen$OffersNotificationScreen.message);
    }

    public VerifyCheckDialogPresenter(FavoritesMessage favoritesMessage, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 14;
        favoritesMessage.getClass();
        this.args = favoritesMessage;
        this.navigator = screenNavigator;
    }

    public VerifyCheckDialogPresenter(NearbyOrderedListsScreen nearbyOrderedListsScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 25;
        nearbyOrderedListsScreen.getClass();
        this.args = nearbyOrderedListsScreen;
        this.navigator = screenNavigator;
    }

    public VerifyCheckDialogPresenter(FailureMessageBlockerFullScreen failureMessageBlockerFullScreen, AndroidActivityFinisher androidActivityFinisher) {
        this.$r8$classId = 2;
        failureMessageBlockerFullScreen.getClass();
        this.args = failureMessageBlockerFullScreen;
        this.navigator = androidActivityFinisher;
    }

    public VerifyCheckDialogPresenter(ControlDisablingConfirmationScreen controlDisablingConfirmationScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 6;
        controlDisablingConfirmationScreen.getClass();
        this.args = controlDisablingConfirmationScreen;
        this.navigator = screenNavigator;
    }

    public VerifyCheckDialogPresenter(HistoryScreens.PaymentReceipt paymentReceipt, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 17;
        paymentReceipt.getClass();
        this.args = paymentReceipt;
        this.navigator = screenNavigator;
    }

    public VerifyCheckDialogPresenter(ConfirmRemoveLinkedBusinessDialogScreen confirmRemoveLinkedBusinessDialogScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 1;
        confirmRemoveLinkedBusinessDialogScreen.getClass();
        this.args = confirmRemoveLinkedBusinessDialogScreen;
        this.navigator = screenNavigator;
    }

    public VerifyCheckDialogPresenter(PhysicalDepositErrorScreen physicalDepositErrorScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 3;
        physicalDepositErrorScreen.getClass();
        this.args = physicalDepositErrorScreen;
        this.navigator = screenNavigator;
    }

    public VerifyCheckDialogPresenter(OnboardingConfirmAccountRemovalScreen onboardingConfirmAccountRemovalScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 28;
        onboardingConfirmAccountRemovalScreen.getClass();
        this.args = onboardingConfirmAccountRemovalScreen;
        this.navigator = screenNavigator;
    }

    public VerifyCheckDialogPresenter(RealPromotedAppletTileStore realPromotedAppletTileStore, AppletId appletId) {
        this.$r8$classId = 21;
        appletId.getClass();
        this.args = realPromotedAppletTileStore;
        this.navigator = appletId;
    }

    public /* synthetic */ VerifyCheckDialogPresenter(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.args = obj;
        this.navigator = obj2;
    }

    public VerifyCheckDialogPresenter(BetterNavigator.ScreenNavigator screenNavigator, TabToolbarPresenter$Factory$Impl tabToolbarPresenter$Factory$Impl) {
        this.$r8$classId = 23;
        this.navigator = screenNavigator;
        this.args = tabToolbarPresenter$Factory$Impl.create(screenNavigator, MoneybotAutomationsScreen.INSTANCE);
    }

    public VerifyCheckDialogPresenter(DirectDepositEditPaycheckAllocationScreen directDepositEditPaycheckAllocationScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 4;
        directDepositEditPaycheckAllocationScreen.getClass();
        this.args = directDepositEditPaycheckAllocationScreen;
        this.navigator = screenNavigator;
    }

    /* renamed from: models, reason: collision with other method in class */
    public void m3467models(Flow flow, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        Continuation continuation = null;
        int i5 = 4;
        int i6 = 1;
        switch (this.$r8$classId) {
            case 15:
                Activity activity = (Activity) this.args;
                flow.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startRestartGroup(-655618539);
                if ((i & 48) == 0) {
                    i2 = i | (gapComposer.changedInstance(this) ? 32 : 16);
                } else {
                    i2 = i;
                }
                if (gapComposer.shouldExecute(i2 & 1, (i2 & 17) != 16)) {
                    Intent intent = new Intent();
                    intent.putExtra("BANKING_APP_ACTIVATION_RESPONSE", ((BlockersScreens.GooglePayProvisioningExitScreen) this.navigator).success ? "approved" : "declined");
                    activity.setResult(-1, intent);
                    activity.finish();
                } else {
                    gapComposer.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new GooglePayPresenter$$ExternalSyntheticLambda0(this, flow, i, 6);
                    break;
                }
                break;
            case 20:
                flow.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startRestartGroup(1679830433);
                if ((i & 6) == 0) {
                    i3 = i | (gapComposer2.changedInstance(flow) ? 4 : 2);
                } else {
                    i3 = i;
                }
                if ((i & 48) == 0) {
                    i3 |= gapComposer2.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer2.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
                    Unit unit = Unit.INSTANCE;
                    boolean changedInstance = gapComposer2.changedInstance(this);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (changedInstance || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new InviteErrorPresenter$models$1$1(this, continuation, i5);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue);
                    Updater.LaunchedEffect(gapComposer2, flow, new CashMapPresenter$models$3$1(flow, continuation, this, 10));
                    boolean changedInstance2 = gapComposer2.changedInstance(this);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new TooltipBoxKt$$ExternalSyntheticLambda2(this, 24);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    Updater.DisposableEffect("finish-activity", (Function1) rememberedValue2, gapComposer2);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup2 = gapComposer2.endRestartGroup();
                if (endRestartGroup2 != null) {
                    endRestartGroup2.block = new HypeWelcomeUIKt$$ExternalSyntheticLambda1(this, flow, i, i6);
                    break;
                }
                break;
            default:
                flow.getClass();
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startRestartGroup(1266754847);
                if ((i & 6) == 0) {
                    i4 = i | (gapComposer3.changedInstance(flow) ? 4 : 2);
                } else {
                    i4 = i;
                }
                if ((i & 48) == 0) {
                    i4 |= gapComposer3.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer3.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
                    Updater.LaunchedEffect(gapComposer3, flow, new RealMRIFactory$sign$2(flow, continuation, this, 22));
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup3 = gapComposer3.endRestartGroup();
                if (endRestartGroup3 != null) {
                    endRestartGroup3.block = new OverlayKt$$ExternalSyntheticLambda2(this, flow, i, 15);
                    break;
                }
                break;
        }
    }

    public PromotedAppletTileViewModel models(Flow flow, Composer composer) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1613152821);
        boolean changed = gapComposer.changed(((AppletId) this.navigator).ordinal());
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new InviteContactsPresenter$special$$inlined$map$1(((RealPromotedAppletTileStore) this.args).getPromotedAppletTiles(), this, 17);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        PromotedAppletTileViewModel promotedAppletTileViewModel = (PromotedAppletTileViewModel) Updater.collectAsState((Flow) rememberedValue, PromotedAppletTileViewModel.Loading.INSTANCE, null, gapComposer, 0, 2).getValue();
        gapComposer.end(false);
        return promotedAppletTileViewModel;
    }
}
