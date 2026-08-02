package com.squareup.cash.checks;

import androidx.camera.video.Recorder;
import androidx.compose.foundation.lazy.LazyListMeasuredItem;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.layout.Placeable;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.DimensionDescription;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.screen.AskedQuestion;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cdf.asset.Origin;
import com.squareup.cash.checks.VerifyCheckDepositViewEvent;
import com.squareup.cash.checks.screens.CaptureCheckFaceScreen;
import com.squareup.cash.checks.screens.CheckFace;
import com.squareup.cash.checks.screens.VerifyCheckDepositScreen;
import com.squareup.cash.data.db.RealAppConfigManager$$ExternalSyntheticLambda6;
import com.squareup.cash.db2.SyncDetailsQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda14;
import com.squareup.cash.fidesmo.real.RealFidesmoClient;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionRowViewModel;
import com.squareup.cash.investing.components.MyFirstConfigurationView$$ExternalSyntheticLambda2;
import com.squareup.cash.investing.primitives.CategoryToken;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.ordertype.autoinvest.InvestingRecurringFrequencyPickerViewModel;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.money.views.MoneyTabThemedHeaderKt$$ExternalSyntheticLambda13;
import com.squareup.cash.moneybot.views.card.InsightChartKt$$ExternalSyntheticLambda19;
import com.squareup.cash.moneybot.views.menu.MoneybotOverflowMenuViewKt$$ExternalSyntheticLambda22;
import com.squareup.cash.offers.views.OffersStyledTextKt$$ExternalSyntheticLambda0;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AliasViewModel;
import com.squareup.cash.paychecks.backend.api.model.EditDistributionConfiguration;
import com.squareup.cash.paychecks.backend.api.model.MultipleAllocationBlocker;
import com.squareup.cash.paychecks.backend.api.model.PaycheckAllocationDistribution;
import com.squareup.cash.paychecks.backend.api.model.PaychecksAlertUi;
import com.squareup.cash.paychecks.screens.EditDistributionScreen;
import com.squareup.cash.paychecks.screens.SetPaycheckMultipleAllocationScreen;
import com.squareup.cash.paychecks.viewmodels.MultipleAllocationViewEvent;
import com.squareup.cash.payments.presenters.PaymentConfigurationPresenter;
import com.squareup.cash.payments.presenters.PaymentRouterData;
import com.squareup.cash.payments.screens.PaymentScheduleSelection;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentRecipientViewModel;
import com.squareup.cash.payments.viewmodels.QuickPayViewEvent;
import com.squareup.cash.payments.views.MainPaymentViewKt$$ExternalSyntheticLambda25;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.profile.views.RingtoneView$playRingtone$1;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.amount.AmountDisplayKeypadListener;
import com.squareup.cash.ui.widget.amount.AmountEvent;
import com.squareup.cash.ui.widget.keypad.KeypadViewModel;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.investing.resources.Period;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.JobKt;

/* loaded from: classes6.dex */
public final class VerifyCheckDepositPresenter$models$3$2 implements Function1 {
    public final /* synthetic */ Object $event;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    public /* synthetic */ VerifyCheckDepositPresenter$models$3$2(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.$event = obj;
        this.this$0 = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CheckFace checkFace;
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        Object obj3 = this.$event;
        switch (i) {
            case 0:
                AskedQuestion askedQuestion = (AskedQuestion) obj;
                askedQuestion.getClass();
                int ordinal = ((VerifyCheckDepositViewEvent.CaptureCheckImage) ((VerifyCheckDepositViewEvent) obj3)).face.ordinal();
                if (ordinal == 0) {
                    checkFace = CheckFace.FRONT;
                } else {
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    checkFace = CheckFace.BACK;
                }
                VerifyCheckDepositScreen verifyCheckDepositScreen = ((VerifyCheckDepositPresenter) obj2).args;
                BlockersData blockersData = verifyCheckDepositScreen.blockersData;
                String str = verifyCheckDepositScreen.checkDepositBlocker.misnap_license_key;
                str.getClass();
                return new CaptureCheckFaceScreen(checkFace, askedQuestion, str, blockersData);
            case 1:
                int intValue = ((Number) obj).intValue();
                return ((RealAppConfigManager$$ExternalSyntheticLambda6) obj3).invoke(Integer.valueOf(intValue), ((List) obj2).get(intValue));
            case 2:
                return ((SyncDetailsQueries$$ExternalSyntheticLambda2) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 3:
                ((ComposeDialogKt$$ExternalSyntheticLambda14) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
                return "payer_row";
            case 4:
                RealFidesmoClient realFidesmoClient = (RealFidesmoClient) obj3;
                JobKt.launch$default(realFidesmoClient.scope, realFidesmoClient.ioDispatcher, null, new RingtoneView$playRingtone$1((Function3) obj2, ((Number) obj).intValue(), (Continuation) null, 9), 2);
                return Unit.INSTANCE;
            case 5:
                return ((GpsConfigQueries$$ExternalSyntheticLambda1) obj3).invoke(((ArrayList) obj2).get(((Number) obj).intValue()));
            case 6:
                return ((GpsConfigQueries$$ExternalSyntheticLambda1) obj3).invoke(((ArrayList) obj2).get(((Number) obj).intValue()));
            case 7:
                return ((MyFirstConfigurationView$$ExternalSyntheticLambda2) obj3).invoke(((ArrayList) obj2).get(((Number) obj).intValue()));
            case 8:
                return ((GpsConfigQueries$$ExternalSyntheticLambda2) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 9:
                ((Boolean) obj).getClass();
                ((MutableState) obj2).setValue(((InvestingRecurringFrequencyPickerViewModel.Content.Option) obj3).frequency);
                return Unit.INSTANCE;
            case 10:
                AskedQuestion askedQuestion2 = (AskedQuestion) obj;
                askedQuestion2.getClass();
                return new InvestingScreens.InvestingCategoryFilterScreen((CategoryToken) ((DisclosurePresenter) obj3).launcher, (Map) obj2, askedQuestion2);
            case 11:
                ((Boolean) obj).getClass();
                String str2 = ((Period) obj2).token;
                str2.getClass();
                ((Function1) obj3).invoke(str2);
                return Unit.INSTANCE;
            case 12:
                int intValue2 = ((Number) obj).intValue();
                return ((CashMapViewKt$$ExternalSyntheticLambda1) obj3).invoke(Integer.valueOf(intValue2), ((List) obj2).get(intValue2));
            case 13:
                int intValue3 = ((Number) obj).intValue();
                return ((CashMapViewKt$$ExternalSyntheticLambda1) obj3).invoke(Integer.valueOf(intValue3), ((List) obj2).get(intValue3));
            case 14:
                int intValue4 = ((Number) obj).intValue();
                return ((MoneyTabThemedHeaderKt$$ExternalSyntheticLambda13) obj3).invoke(Integer.valueOf(intValue4), ((List) obj2).get(intValue4));
            case 15:
                return ((MoneybotOverflowMenuViewKt$$ExternalSyntheticLambda22) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 16:
                return ((InsightChartKt$$ExternalSyntheticLambda19) obj3).invoke(((ArrayList) obj2).get(((Number) obj).intValue()));
            case 17:
                return ((MoneybotOverflowMenuViewKt$$ExternalSyntheticLambda22) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 18:
                LazyListMeasuredItem lazyListMeasuredItem = (LazyListMeasuredItem) obj;
                lazyListMeasuredItem.getClass();
                return Boolean.valueOf(lazyListMeasuredItem.key.equals(((OffersStyledTextKt$$ExternalSyntheticLambda0) obj3).invoke(obj2)));
            case 19:
                LazyListMeasuredItem lazyListMeasuredItem2 = (LazyListMeasuredItem) obj;
                lazyListMeasuredItem2.getClass();
                return Boolean.valueOf(lazyListMeasuredItem2.key.equals(((OffersStyledTextKt$$ExternalSyntheticLambda0) obj3).invoke(obj2)));
            case 20:
                ((Boolean) obj).getClass();
                ((MutableState) obj2).setValue(((AliasViewModel) obj3).aliasId);
                return Unit.INSTANCE;
            case 21:
                AskedQuestion askedQuestion3 = (AskedQuestion) obj;
                askedQuestion3.getClass();
                CardLockPresenter cardLockPresenter = (CardLockPresenter) obj3;
                SetPaycheckMultipleAllocationScreen setPaycheckMultipleAllocationScreen = (SetPaycheckMultipleAllocationScreen) cardLockPresenter.args;
                BlockersData blockersData2 = setPaycheckMultipleAllocationScreen.blockersData;
                MultipleAllocationBlocker multipleAllocationBlocker = (MultipleAllocationBlocker) cardLockPresenter.ioDispatcher;
                MultipleAllocationViewEvent.OpenSingleAllocationEditor openSingleAllocationEditor = (MultipleAllocationViewEvent.OpenSingleAllocationEditor) ((MultipleAllocationViewEvent) obj2);
                int i2 = openSingleAllocationEditor.currentAllocationIndex;
                List list = openSingleAllocationEditor.distribution;
                multipleAllocationBlocker.getClass();
                list.getClass();
                PaychecksAlertUi paychecksAlertUi = multipleAllocationBlocker.exceededMaxDistributionAlertUi;
                Money money = multipleAllocationBlocker.averageMonthlyPaycheck;
                List<MultipleAllocationBlocker.Allocation> list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                for (MultipleAllocationBlocker.Allocation allocation : list2) {
                    MultipleAllocationBlocker.Allocation.Editability editability = allocation.editability;
                    EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements selectedStateUiElements = editability instanceof MultipleAllocationBlocker.Allocation.Editable ? new EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements(((MultipleAllocationBlocker.Allocation.Editable) editability).displayName, multipleAllocationBlocker.customAmountSubtitle, EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements.BackButtonBehavior.DISMISS, multipleAllocationBlocker.atmPickerOptionsInBasisPoints, new EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements.Button(EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements.Button.ButtonAction.CONFIRM, multipleAllocationBlocker.callToAction.submitActionText), null, null, multipleAllocationBlocker.atmOptionAccessibilityHintTemplate, multipleAllocationBlocker.customAmountAccessibilityHint, multipleAllocationBlocker.explanation) : null;
                    PaycheckAllocationDistribution.DestinationAndShare destinationAndShare = allocation.destination;
                    arrayList.add(new EditDistributionConfiguration.DestinationUiConfiguration(destinationAndShare.destination, destinationAndShare.shareInBasisPoints, allocation.color, selectedStateUiElements, null));
                }
                return new EditDistributionScreen(blockersData2, new EditDistributionConfiguration(arrayList, i2, paychecksAlertUi, money), askedQuestion3, false, setPaycheckMultipleAllocationScreen.accentColor);
            case 22:
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                placementScope.getClass();
                Placeable placeable = (Placeable) obj3;
                placementScope.placeRelative(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                placementScope.placeRelative((Placeable) obj2, 0, placeable.height, RecyclerView.DECELERATION_RATE);
                return Unit.INSTANCE;
            case 23:
                AskedQuestion askedQuestion4 = (AskedQuestion) obj;
                askedQuestion4.getClass();
                MutableState mutableState = (MutableState) obj2;
                PaymentScheduleSelection paymentScheduleSelection = ((PaymentRouterData) mutableState.getValue()).scheduleSelection;
                PaymentConfigurationPresenter paymentConfigurationPresenter = (PaymentConfigurationPresenter) obj3;
                String uuid = paymentConfigurationPresenter.paymentToken.toString();
                uuid.getClass();
                String str3 = paymentConfigurationPresenter.flowToken;
                Origin origin = paymentConfigurationPresenter.analyticsOrigin;
                InstrumentSelectionRowViewModel instrumentSelectionRowViewModel = ((PaymentRouterData) mutableState.getValue()).instrumentRowModel;
                return new PaymentScreens.SchedulePayment(askedQuestion4, uuid, paymentScheduleSelection, str3, origin, instrumentSelectionRowViewModel != null ? instrumentSelectionRowViewModel.cashInstrumentType : null);
            case 24:
                String str4 = (String) obj;
                str4.getClass();
                ((MutableState) obj2).setValue(str4);
                ((Function1) obj3).invoke(new QuickPayViewEvent.NoteEntered(str4));
                return Unit.INSTANCE;
            case 25:
                KeypadViewModel.KeypadKey keypadKey = (KeypadViewModel.KeypadKey) obj;
                AmountDisplayKeypadListener amountDisplayKeypadListener = (AmountDisplayKeypadListener) obj2;
                keypadKey.getClass();
                ((FocusOwnerImpl) obj3).clearFocus(false);
                if (keypadKey.isDigit()) {
                    amountDisplayKeypadListener.onDigit(Integer.parseInt(keypadKey.value));
                } else if (keypadKey.isClear()) {
                    amountDisplayKeypadListener.onBackspace();
                } else if (keypadKey.isSeparator()) {
                    amountDisplayKeypadListener.onDecimal();
                }
                return Unit.INSTANCE;
            case 26:
                AmountEvent amountEvent = (AmountEvent) obj;
                amountEvent.getClass();
                if (amountEvent instanceof AmountEvent.AmountChanged) {
                    ((Function1) obj3).invoke(new QuickPayViewEvent.AmountEntered(((AmountEvent.AmountChanged) amountEvent).rawAmount));
                } else {
                    if (!(amountEvent instanceof AmountEvent.InvalidChange)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    RealCashVibrator realCashVibrator = (RealCashVibrator) obj2;
                    if (realCashVibrator != null) {
                        realCashVibrator.error();
                    }
                }
                return Unit.INSTANCE;
            case 27:
                return ((MainPaymentViewKt$$ExternalSyntheticLambda25) obj3).invoke(((ArrayList) obj2).get(((Number) obj).intValue()));
            case 28:
                return ((PoolDetailsViewKt$$ExternalSyntheticLambda3) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            default:
                ConstrainScope constrainScope = (ConstrainScope) obj;
                constrainScope.getClass();
                Recorder.AnonymousClass4 anonymousClass4 = constrainScope.bottom;
                ConstrainedLayoutReference constrainedLayoutReference = constrainScope.parent;
                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(anonymousClass4, !((PersonalizePaymentRecipientViewModel.Loaded) obj3).isCurrentCustomerSender ? ((ConstrainedLayoutReference) obj2).top : constrainedLayoutReference.bottom, 16.0f, 4);
                ConstrainScope.m1077linkTo8ZKsbrE$default(constrainScope, constrainedLayoutReference.start, constrainedLayoutReference.end, 84.0f, 84.0f, 48);
                constrainScope.setWidth(new DimensionDescription("preferWrap"));
                return Unit.INSTANCE;
        }
    }
}
